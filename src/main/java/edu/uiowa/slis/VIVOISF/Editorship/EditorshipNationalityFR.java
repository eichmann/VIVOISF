package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityFRIterator theEditorship = (EditorshipNationalityFRIterator)findAncestorWithClass(this, EditorshipNationalityFRIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

