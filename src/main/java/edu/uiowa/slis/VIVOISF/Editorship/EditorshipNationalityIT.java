package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityITIterator theEditorship = (EditorshipNationalityITIterator)findAncestorWithClass(this, EditorshipNationalityITIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

