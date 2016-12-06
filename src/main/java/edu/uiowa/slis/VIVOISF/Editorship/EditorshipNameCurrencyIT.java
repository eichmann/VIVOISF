package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyITIterator theEditorship = (EditorshipNameCurrencyITIterator)findAncestorWithClass(this, EditorshipNameCurrencyITIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

