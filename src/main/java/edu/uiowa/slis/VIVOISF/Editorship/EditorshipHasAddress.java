package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasAddressIterator theEditorshipHasAddressIterator = (EditorshipHasAddressIterator)findAncestorWithClass(this, EditorshipHasAddressIterator.class);
			pageContext.getOut().print(theEditorshipHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

