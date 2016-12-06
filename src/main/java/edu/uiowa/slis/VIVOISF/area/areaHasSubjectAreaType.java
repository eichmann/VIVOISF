package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasSubjectAreaIterator theareaHasSubjectAreaIterator = (areaHasSubjectAreaIterator)findAncestorWithClass(this, areaHasSubjectAreaIterator.class);
			pageContext.getOut().print(theareaHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}
