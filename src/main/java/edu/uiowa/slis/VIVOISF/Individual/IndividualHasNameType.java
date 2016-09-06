package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasNameIterator theIndividualHasNameIterator = (IndividualHasNameIterator)findAncestorWithClass(this, IndividualHasNameIterator.class);
			pageContext.getOut().print(theIndividualHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasName tag ");
		}
		return SKIP_BODY;
	}
}

