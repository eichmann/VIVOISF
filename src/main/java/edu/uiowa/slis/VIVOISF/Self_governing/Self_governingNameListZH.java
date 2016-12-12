package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListZHIterator theSelf_governing = (Self_governingNameListZHIterator)findAncestorWithClass(this, Self_governingNameListZHIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

