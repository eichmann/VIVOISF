package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRO_0001015Iterator theIndividualRO_0001015Iterator = (IndividualRO_0001015Iterator)findAncestorWithClass(this, IndividualRO_0001015Iterator.class);
			pageContext.getOut().print(theIndividualRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

