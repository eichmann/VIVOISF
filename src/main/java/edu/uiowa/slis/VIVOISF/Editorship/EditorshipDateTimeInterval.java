package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipDateTimeIntervalIterator theEditorshipDateTimeIntervalIterator = (EditorshipDateTimeIntervalIterator)findAncestorWithClass(this, EditorshipDateTimeIntervalIterator.class);
			pageContext.getOut().print(theEditorshipDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

