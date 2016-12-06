package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualBFO_0000051Iterator theIndividualBFO_0000051Iterator = (IndividualBFO_0000051Iterator)findAncestorWithClass(this, IndividualBFO_0000051Iterator.class);
			pageContext.getOut().print(theIndividualBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

