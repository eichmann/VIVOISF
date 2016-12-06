package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipDateTimeIntervalIterator theEditorshipDateTimeIntervalIterator = (EditorshipDateTimeIntervalIterator)findAncestorWithClass(this, EditorshipDateTimeIntervalIterator.class);
			pageContext.getOut().print(theEditorshipDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

