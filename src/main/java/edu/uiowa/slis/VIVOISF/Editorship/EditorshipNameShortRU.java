package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortRUIterator theEditorship = (EditorshipNameShortRUIterator)findAncestorWithClass(this, EditorshipNameShortRUIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

