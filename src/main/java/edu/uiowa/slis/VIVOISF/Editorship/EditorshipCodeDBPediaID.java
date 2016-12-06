package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeDBPediaIDIterator theEditorship = (EditorshipCodeDBPediaIDIterator)findAncestorWithClass(this, EditorshipCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theEditorship.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

