package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListRUIterator theSelf_governing = (Self_governingNameListRUIterator)findAncestorWithClass(this, Self_governingNameListRUIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

