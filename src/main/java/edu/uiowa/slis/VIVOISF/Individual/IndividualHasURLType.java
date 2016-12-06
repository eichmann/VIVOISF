package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasURLIterator theIndividualHasURLIterator = (IndividualHasURLIterator)findAncestorWithClass(this, IndividualHasURLIterator.class);
			pageContext.getOut().print(theIndividualHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

