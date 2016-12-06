package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeUNDPIterator theEditorship = (EditorshipCodeUNDPIterator)findAncestorWithClass(this, EditorshipCodeUNDPIterator.class);
			pageContext.getOut().print(theEditorship.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

