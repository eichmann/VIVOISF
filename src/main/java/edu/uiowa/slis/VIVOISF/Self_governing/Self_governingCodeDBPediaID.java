package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeDBPediaIDIterator theSelf_governing = (Self_governingCodeDBPediaIDIterator)findAncestorWithClass(this, Self_governingCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

