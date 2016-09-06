package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRelatesIterator theEditorshipRelatesIterator = (EditorshipRelatesIterator)findAncestorWithClass(this, EditorshipRelatesIterator.class);
			pageContext.getOut().print(theEditorshipRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for relates tag ");
		}
		return SKIP_BODY;
	}
}

