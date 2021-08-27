package depthFirstSearch;

/**Подсчёт времени необходимого на оповещение всех сотрудников компании при последовательном движении информации от
 * начальников к подчинённым в соответствии со временами на передачу. У одного подчинённого может быть только один прямой начальник
 * @author Сергей Шершавин*/

public class TimeNeededToInformAllEmployees {

    /**@param n число сотрудников
     * @param manager manager[i] хранит индекс сотрудника, который является начальником i-го сотрудника (глава компании хранит индекс -1)
     * @param informTime informTime[i] время, которое требуется i-му сотруднику, чтобы оповестить своих прямых подчинённых*/
    public int numOfMinutes(int n, int[] manager, int[] informTime) {
        int time = 0;
        for (int i = 0; i < n; i++) {
            dfs(manager, informTime, i);
            time = Math.max(time, informTime[i]); //informTime[i] - время, требующееся i-му сотруднику, чтобы донести информацию до подчинённых с учётом задержки получения от вышестоящих сотрудников
        }
        return time;
    }

    private void dfs(int[] manager, int[] informTime, int current) {
        if (manager[current] == -1) return;
        dfs(manager, informTime, manager[current]);
        informTime[current] += informTime[manager[current]];
        manager[current] = -1;
    }
}
