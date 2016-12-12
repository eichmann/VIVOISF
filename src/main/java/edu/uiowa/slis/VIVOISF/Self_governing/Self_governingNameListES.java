package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListESIterator theSelf_governing = (Self_governingNameListESIterator)findAncestorWithClass(this, Self_governingNameListESIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

