package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityESIterator theEditorship = (EditorshipNationalityESIterator)findAncestorWithClass(this, EditorshipNationalityESIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

