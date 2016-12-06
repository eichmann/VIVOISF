package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipFreetextKeywordIterator theEditorship = (EditorshipFreetextKeywordIterator)findAncestorWithClass(this, EditorshipFreetextKeywordIterator.class);
			pageContext.getOut().print(theEditorship.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

