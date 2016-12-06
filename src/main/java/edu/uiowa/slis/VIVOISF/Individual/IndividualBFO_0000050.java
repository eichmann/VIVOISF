package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualBFO_0000050Iterator theIndividualBFO_0000050Iterator = (IndividualBFO_0000050Iterator)findAncestorWithClass(this, IndividualBFO_0000050Iterator.class);
			pageContext.getOut().print(theIndividualBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

