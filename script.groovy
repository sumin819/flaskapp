def buildApp() {

echo 'building the applications...'

}

def testApp() {

echo 'testing the applications...'

}

def deployApp() {

echo 'deploying the applicaiton...'

echo "deploying version ${params.VERSION}"

}

return this
