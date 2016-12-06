package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListRUIterator theEditorship = (EditorshipNameListRUIterator)findAncestorWithClass(this, EditorshipNameListRUIterator.class);
			pageContext.getOut().print(theEditorship.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

