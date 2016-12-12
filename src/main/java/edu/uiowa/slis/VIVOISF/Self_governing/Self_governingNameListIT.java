package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListITIterator theSelf_governing = (Self_governingNameListITIterator)findAncestorWithClass(this, Self_governingNameListITIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

