package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingGeographicFocusOfIterator theSelf_governingGeographicFocusOfIterator = (Self_governingGeographicFocusOfIterator)findAncestorWithClass(this, Self_governingGeographicFocusOfIterator.class);
			pageContext.getOut().print(theSelf_governingGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

