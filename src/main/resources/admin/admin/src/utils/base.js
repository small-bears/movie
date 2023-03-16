const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot9cd99/",
            name: "springboot9cd99",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9cd99/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "影城管理系统"
        } 
    }
}
export default base
