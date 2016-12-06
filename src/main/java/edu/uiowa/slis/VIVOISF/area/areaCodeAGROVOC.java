package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeAGROVOCIterator thearea = (areaCodeAGROVOCIterator)findAncestorWithClass(this, areaCodeAGROVOCIterator.class);
			pageContext.getOut().print(thearea.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

