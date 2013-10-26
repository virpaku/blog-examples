// default configurations
mail {
    server = 'localhost'
    port = 25
}

// environment-specific configurations
environments {
    dev {
        serverName = 'http://localhost:9090'        
    }
    
    test {
        serverName = 'http://testserver'
        mail {
            server = 'mail.testserver'
        }
    }
    
    prod {
        serverName = 'http://www.mrhaki.com'
        mail {
            port = 552
            server = 'mail.host.com'
        }
    }
}
