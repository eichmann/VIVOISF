package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeAGROVOCIterator theEditorship = (EditorshipCodeAGROVOCIterator)findAncestorWithClass(this, EditorshipCodeAGROVOCIterator.class);
			pageContext.getOut().print(theEditorship.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

