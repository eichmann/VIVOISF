package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipUrlIterator theEditorship = (EditorshipUrlIterator)findAncestorWithClass(this, EditorshipUrlIterator.class);
			pageContext.getOut().print(theEditorship.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for url tag ");
		}
		return SKIP_BODY;
	}
}

