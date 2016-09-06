package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRelatedByIterator theIndividualRelatedByIterator = (IndividualRelatedByIterator)findAncestorWithClass(this, IndividualRelatedByIterator.class);
			pageContext.getOut().print(theIndividualRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

