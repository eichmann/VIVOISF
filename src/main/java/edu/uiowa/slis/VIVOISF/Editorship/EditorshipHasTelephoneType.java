package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasTelephoneIterator theEditorshipHasTelephoneIterator = (EditorshipHasTelephoneIterator)findAncestorWithClass(this, EditorshipHasTelephoneIterator.class);
			pageContext.getOut().print(theEditorshipHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

