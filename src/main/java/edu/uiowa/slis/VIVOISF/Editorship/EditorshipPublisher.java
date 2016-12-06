package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipPublisherIterator theEditorshipPublisherIterator = (EditorshipPublisherIterator)findAncestorWithClass(this, EditorshipPublisherIterator.class);
			pageContext.getOut().print(theEditorshipPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for publisher tag ");
		}
		return SKIP_BODY;
	}
}

