package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipDescriptionIterator theEditorship = (EditorshipDescriptionIterator)findAncestorWithClass(this, EditorshipDescriptionIterator.class);
			pageContext.getOut().print(theEditorship.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for description tag ");
		}
		return SKIP_BODY;
	}
}

