package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyESIterator theEditorship = (EditorshipNameCurrencyESIterator)findAncestorWithClass(this, EditorshipNameCurrencyESIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

