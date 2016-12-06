package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialRUIterator theEditorship = (EditorshipNameOfficialRUIterator)findAncestorWithClass(this, EditorshipNameOfficialRUIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

