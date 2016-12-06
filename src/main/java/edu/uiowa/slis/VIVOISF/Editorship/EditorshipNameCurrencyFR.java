package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyFRIterator theEditorship = (EditorshipNameCurrencyFRIterator)findAncestorWithClass(this, EditorshipNameCurrencyFRIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

