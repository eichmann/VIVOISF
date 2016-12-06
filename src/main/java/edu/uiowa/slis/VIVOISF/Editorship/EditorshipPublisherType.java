package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipPublisherIterator theEditorshipPublisherIterator = (EditorshipPublisherIterator)findAncestorWithClass(this, EditorshipPublisherIterator.class);
			pageContext.getOut().print(theEditorshipPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for publisher tag ");
		}
		return SKIP_BODY;
	}
}

