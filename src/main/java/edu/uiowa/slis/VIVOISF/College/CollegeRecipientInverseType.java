package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeRecipientInverseIterator theCollegeRecipientInverseIterator = (CollegeRecipientInverseIterator)findAncestorWithClass(this, CollegeRecipientInverseIterator.class);
			pageContext.getOut().print(theCollegeRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for recipient tag ");
		}
		return SKIP_BODY;
	}
}

