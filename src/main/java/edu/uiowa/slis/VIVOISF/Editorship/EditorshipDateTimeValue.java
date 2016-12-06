package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipDateTimeValueIterator theEditorshipDateTimeValueIterator = (EditorshipDateTimeValueIterator)findAncestorWithClass(this, EditorshipDateTimeValueIterator.class);
			pageContext.getOut().print(theEditorshipDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

