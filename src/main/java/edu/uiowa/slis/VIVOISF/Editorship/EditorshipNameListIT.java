package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListITIterator theEditorship = (EditorshipNameListITIterator)findAncestorWithClass(this, EditorshipNameListITIterator.class);
			pageContext.getOut().print(theEditorship.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

