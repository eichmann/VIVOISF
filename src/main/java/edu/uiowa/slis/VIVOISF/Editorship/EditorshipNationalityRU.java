package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityRUIterator theEditorship = (EditorshipNationalityRUIterator)findAncestorWithClass(this, EditorshipNationalityRUIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

