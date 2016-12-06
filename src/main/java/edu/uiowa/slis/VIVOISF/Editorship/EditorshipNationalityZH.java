package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNationalityZHIterator theEditorship = (EditorshipNationalityZHIterator)findAncestorWithClass(this, EditorshipNationalityZHIterator.class);
			pageContext.getOut().print(theEditorship.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

