package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasEmailIterator theIndividualHasEmailIterator = (IndividualHasEmailIterator)findAncestorWithClass(this, IndividualHasEmailIterator.class);
			pageContext.getOut().print(theIndividualHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

