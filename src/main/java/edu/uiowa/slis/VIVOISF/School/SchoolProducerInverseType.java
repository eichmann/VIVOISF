package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolProducerInverseIterator theSchoolProducerInverseIterator = (SchoolProducerInverseIterator)findAncestorWithClass(this, SchoolProducerInverseIterator.class);
			pageContext.getOut().print(theSchoolProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for producer tag ");
		}
		return SKIP_BODY;
	}
}

