package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCountryAreaTotalIterator theEditorship = (EditorshipCountryAreaTotalIterator)findAncestorWithClass(this, EditorshipCountryAreaTotalIterator.class);
			pageContext.getOut().print(theEditorship.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

