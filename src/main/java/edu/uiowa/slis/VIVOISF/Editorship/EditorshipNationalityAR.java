package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityARIterator theEditorship = (EditorshipNationalityARIterator)findAncestorWithClass(this, EditorshipNationalityARIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

