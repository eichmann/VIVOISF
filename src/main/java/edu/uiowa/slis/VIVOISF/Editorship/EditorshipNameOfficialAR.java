package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialARIterator theEditorship = (EditorshipNameOfficialARIterator)findAncestorWithClass(this, EditorshipNameOfficialARIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

