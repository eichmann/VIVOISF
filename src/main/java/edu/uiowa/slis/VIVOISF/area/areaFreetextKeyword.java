package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(areaFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaFreetextKeywordIterator thearea = (areaFreetextKeywordIterator)findAncestorWithClass(this, areaFreetextKeywordIterator.class);
			pageContext.getOut().print(thearea.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing area for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

