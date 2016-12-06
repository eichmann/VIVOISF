package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasSubjectAreaIterator theeconomic_regionHasSubjectAreaIterator = (economic_regionHasSubjectAreaIterator)findAncestorWithClass(this, economic_regionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theeconomic_regionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

