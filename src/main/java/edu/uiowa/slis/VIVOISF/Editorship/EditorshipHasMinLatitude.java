package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasMinLatitudeIterator theEditorship = (EditorshipHasMinLatitudeIterator)findAncestorWithClass(this, EditorshipHasMinLatitudeIterator.class);
			pageContext.getOut().print(theEditorship.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

