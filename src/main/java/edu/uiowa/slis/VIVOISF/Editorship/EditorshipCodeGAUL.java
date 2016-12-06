package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeGAULIterator theEditorship = (EditorshipCodeGAULIterator)findAncestorWithClass(this, EditorshipCodeGAULIterator.class);
			pageContext.getOut().print(theEditorship.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

