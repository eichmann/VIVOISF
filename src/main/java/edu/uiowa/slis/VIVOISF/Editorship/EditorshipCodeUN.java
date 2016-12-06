package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeUNIterator theEditorship = (EditorshipCodeUNIterator)findAncestorWithClass(this, EditorshipCodeUNIterator.class);
			pageContext.getOut().print(theEditorship.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

